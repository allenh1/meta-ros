# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Virtual package providing ViSP related packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native visp-auto-tracker visp-bridge visp-camera-calibration visp-hand2eye-calibration visp-tracker"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/vision_visp/0.10.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3121cb2fb3bbf9ab5c6063bed4f720a6"
SRC_URI[sha256sum] = "4f629d14644e52762755cc3b86b2e6b88bbf9a6d05f273f081d23300a1bcb9fa"
S = "${WORKDIR}/vision_visp-release-release-lunar-vision_visp-0.10.0-1"

inherit catkin
