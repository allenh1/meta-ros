# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The jsk_tilt_laser package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules dynamic-reconfigure laser-assembler laser-filters multisense-lib robot-state-publisher sensor-msgs tf tf-conversions urg-node"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/jsk_tilt_laser/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "89c73a7927ea684824aba6213bdb423f"
SRC_URI[sha256sum] = "2b711691e340e7ededa38492e798f37d1d7929fed292513e032cd279ed4dc629"
S = "${WORKDIR}/jsk_common-release-release-kinetic-jsk_tilt_laser-2.2.5-0"

inherit catkin
