# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The visulalization_marker_tutorials package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin roscpp visualization_msgs"
SRC_URI = "https://github.com/ros-gbp/visualization_tutorials-release/archive/release/lunar/visualization_marker_tutorials/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "99ba0ff19708b98aaf954ec92fe6e809"
SRC_URI[sha256sum] = "1aaf6f758eb6f4fb7b73687efa5d4c384821a83e8ac5aaef063615a665cc0081"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
