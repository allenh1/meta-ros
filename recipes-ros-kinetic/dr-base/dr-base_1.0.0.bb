# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Delft Robotics base dependencies."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=4cd4567faa8f9b08cdfe5d675d01cbbb"

DEPENDS = "catkin-native dr-cmake"
SRC_URI = "https://github.com/delftrobotics/dr_base-release/archive/release/kinetic/dr_base/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c3178e8cd2aaedf43e553aed41cdf4f"
SRC_URI[sha256sum] = "3458015b4fdcd90adaa71b2d7202a413518ee58b883d076418db654dce93b3f2"
S = "${WORKDIR}/dr_base-release-release-kinetic-dr_base-1.0.0-0"

inherit catkin
