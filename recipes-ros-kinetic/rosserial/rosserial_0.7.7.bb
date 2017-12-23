# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage for core of rosserial."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosserial-client rosserial-msgs rosserial-python"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f36ed2bec3a4406d8b8ddadb5dfc65fb"
SRC_URI[sha256sum] = "6606fcce561bf3ed40615081008df3d618038ac9bdcb2b123b35457244af825e"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.7.7-0"

inherit catkin
