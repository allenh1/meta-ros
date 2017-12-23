# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The manipulator_h_base_module_msgs package     This package includes ROS message"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime roscpp rospy sensor-msgs std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-MANIPULATOR-H-release/archive/release/kinetic/manipulator_h_base_module_msgs/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "69e7c080309c3c6b0a8e502444114b2a"
SRC_URI[sha256sum] = "d90e474699e9786e6326ef30b7a625876f5e5dd7126b03a3907d46928a69bc8c"
S = "${WORKDIR}/ROBOTIS-MANIPULATOR-H-release-release-kinetic-manipulator_h_base_module_msgs-0.2.3-0"

inherit catkin
