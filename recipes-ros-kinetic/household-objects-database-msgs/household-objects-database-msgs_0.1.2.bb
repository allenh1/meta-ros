# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The household_objects_database_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime object-recognition-msgs shape-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/household_objects_database_msgs-release/archive/release/kinetic/household_objects_database_msgs/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0fdc8f64479a600cad59bec719195ce7"
SRC_URI[sha256sum] = "e1ca12a7e691e83a055f770f6a27f645512a959b18e8c66539e482520529aee7"
S = "${WORKDIR}/household_objects_database_msgs-release-release-kinetic-household_objects_database_msgs-0.1.2-0"

inherit catkin
