# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The fzi_icl_comm package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native cmake fzi-icl-core roscpp"
SRC_URI = "https://github.com/fzi-forschungszentrum-informatik/fzi_icl_comm-release/archive/release/kinetic/fzi_icl_comm/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e9df256baf0630eadf98d0d4f9c633da"
SRC_URI[sha256sum] = "79edb6c68c49cf7d30ce867155632c236cc1e7e978a9cafd91e96d2784652a21"
S = "${WORKDIR}/fzi_icl_comm-release-release-kinetic-fzi_icl_comm-0.0.2-0"

inherit catkin
