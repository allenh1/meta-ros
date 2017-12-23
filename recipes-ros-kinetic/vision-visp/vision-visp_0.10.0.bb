# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Virtual package providing ViSP related packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native visp-auto-tracker visp-bridge visp-camera-calibration visp-hand2eye-calibration visp-tracker"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/kinetic/vision_visp/0.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0919088246582905013456e2ba62b09b"
SRC_URI[sha256sum] = "845f27290a1e11389067b23bf2159cbea304a737df10fc51dbb585c2549bddce"
S = "${WORKDIR}/vision_visp-release-release-kinetic-vision_visp-0.10.0-0"

inherit catkin
