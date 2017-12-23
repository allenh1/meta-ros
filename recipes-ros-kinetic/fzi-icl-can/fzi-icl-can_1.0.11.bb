# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The fzi_icl_can package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native cmake fzi-icl-core libpcan libpopt-dev linux-headers-generic libtinyxml wget"
SRC_URI = "https://github.com/fzi-forschungszentrum-informatik/fzi_icl_can-release/archive/release/kinetic/fzi_icl_can/1.0.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54b0a3ff059b0c0dba91bc794111d89a"
SRC_URI[sha256sum] = "20d111da9da0ed8bed825a559b452a15a147ecef9fc113b213125cfcd039840a"
S = "${WORKDIR}/fzi_icl_can-release-release-kinetic-fzi_icl_can-1.0.11-0"

inherit catkin
