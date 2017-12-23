# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages related to the Point Grey camera driver."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/kinetic/statistics_msgs/0.13.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0207adb1b4d0b5fe43e1d4f7e0c763b7"
SRC_URI[sha256sum] = "0593822189fe6b7bae956bac76fad51b843825bee0a0d6a5a6f6b1689db7fa82"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-kinetic-statistics_msgs-0.13.4-0"

inherit catkin
