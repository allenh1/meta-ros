# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages related to the Point Grey camera driver."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/lunar/statistics_msgs/0.13.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a75b0ffa6f7d49248bc52373ed706f8e"
SRC_URI[sha256sum] = "70734b28a4e4a86701db05406878b8e0ecfecdd3f61bf6579144d83621232ee9"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-lunar-statistics_msgs-0.13.3-0"

inherit catkin
