# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for Geographic Information Systems."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs uuid-msgs"
SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/kinetic/geographic_msgs/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "041a31784df99c9b7a3a49fa0171948f"
SRC_URI[sha256sum] = "443a30531ab1edbefc9935c53bd524bfb7532bf028f472dbb277d6da97d5ffe1"
S = "${WORKDIR}/geographic_info-release-release-kinetic-geographic_msgs-0.5.2-0"

inherit catkin
