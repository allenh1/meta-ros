# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The fzi_icl_core package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "boost catkin-native cmake libtinyxml"
SRC_URI = "https://github.com/fzi-forschungszentrum-informatik/fzi_icl_core-release/archive/release/kinetic/fzi_icl_core/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "01b4748d57e50fc893dd772375d65bd9"
SRC_URI[sha256sum] = "319cdebb275fded9216a64c17608ff047b021e2d68694176652d19acaa7bf70d"
S = "${WORKDIR}/fzi_icl_core-release-release-kinetic-fzi_icl_core-1.0.6-0"

inherit catkin
