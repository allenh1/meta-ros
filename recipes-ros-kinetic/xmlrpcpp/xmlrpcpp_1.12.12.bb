# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "XmlRpc++ is a C++ implementation of the XML-RPC protocol. This version is     he"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=184dd1523b9a109aead3fbbe0b4262e0"

DEPENDS = "catkin-native cpp-common"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "41e714af71f8355e1169d85959513934"
SRC_URI[sha256sum] = "12b58e8e5a73fd5c959ce522526675ec51f52d3694f8104f6206bc547e25f2b2"
S = "${WORKDIR}/ros_comm-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin
