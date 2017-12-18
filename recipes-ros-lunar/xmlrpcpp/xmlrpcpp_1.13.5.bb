# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "XmlRpc++ is a C++ implementation of the XML-RPC protocol. This version is     he"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=184dd1523b9a109aead3fbbe0b4262e0"

DEPENDS = "catkin-native catkin cpp-common"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/${PN}/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d756369adfd8f98649026641bef7a5bf"
SRC_URI[sha256sum] = "9623b8a4e6bf4a4a6baad6508be8d9de43fb6e908eff71ef2a76412d7a715c61"
S = "${WORKDIR}/ros_comm-release-release-lunar-${PN}-1.13.5-0"

inherit catkin
