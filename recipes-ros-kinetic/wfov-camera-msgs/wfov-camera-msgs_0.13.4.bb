# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages related to the Point Grey camera driver."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/kinetic/wfov_camera_msgs/0.13.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dff5c543e64b1a067d5af94995081365"
SRC_URI[sha256sum] = "b3874667fc02b1385570b3e98270083e1bbc26e91c69d00b5e38cfbc652d3192"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-kinetic-wfov_camera_msgs-0.13.4-0"

inherit catkin
