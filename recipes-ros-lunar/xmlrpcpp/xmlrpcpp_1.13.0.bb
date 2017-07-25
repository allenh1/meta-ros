# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "XmlRpc++ is a C++ implementation of the XML-RPC protocol. This version is     he"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=184dd1523b9a109aead3fbbe0b4262e0"

DEPENDS = "catkin-native cpp-common"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/xmlrpcpp/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8b9a68f82e42266f4916ec872c4e03b6"
SRC_URI[sha256sum] = "ba7a0007598c092ebf6b641deb2da20325866c03d05524422c04f8f2f92f78a4"
S = "${WORKDIR}/ros_comm-release-release-lunar-xmlrpcpp-1.13.0-0"

inherit catkin
