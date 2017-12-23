# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An implementation of zeroconf in pure java."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native rosjava-bootstrap rosjava-build-tools"
SRC_URI = "https://github.com/rosjava-release/zeroconf_jmdns_suite-release/archive/release/kinetic/zeroconf_jmdns_suite/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e099df76cbf2d796e8cc595cef0da76f"
SRC_URI[sha256sum] = "388997262ff40f1ddce703e40f74e0b7998cf6c21d746388ca3e6354c25bc1ce"
S = "${WORKDIR}/zeroconf_jmdns_suite-release-release-kinetic-zeroconf_jmdns_suite-0.3.0-0"

inherit catkin
