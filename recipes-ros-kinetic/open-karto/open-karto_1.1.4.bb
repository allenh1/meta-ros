# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkinized ROS packaging of the OpenKarto library"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost catkin-native"
SRC_URI = "https://github.com/ros-gbp/open_karto-release/archive/release/kinetic/open_karto/1.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3da0e35c1b20a9bb371365582c6bde7b"
SRC_URI[sha256sum] = "0ea5824754feaebb979c76ebe0e352e922b175dd7a5fc0a777e94f2329062f59"
S = "${WORKDIR}/open_karto-release-release-kinetic-open_karto-1.1.4-0"

inherit catkin
