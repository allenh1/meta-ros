# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages related to the Point Grey camera driver."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime sensor-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/pointgrey_camera_driver-release/archive/release/lunar/wfov_camera_msgs/0.13.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca9a2699981cafce3abb111b48a0775d"
SRC_URI[sha256sum] = "0caca4360ff3485c319adedd1013bbeb4dfe8dbfdb2b4338c4c1285dbefffcf7"
S = "${WORKDIR}/pointgrey_camera_driver-release-release-lunar-wfov_camera_msgs-0.13.3-0"

inherit catkin
