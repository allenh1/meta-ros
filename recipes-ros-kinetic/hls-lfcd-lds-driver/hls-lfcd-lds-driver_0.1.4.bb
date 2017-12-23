# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS package for LDS(HLS-LFCD2).     The LDS (Laser Distance Sensor) is a sensor "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native roscpp sensor-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/${PN}-release/archive/release/kinetic/hls_lfcd_lds_driver/0.1.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d6c4acb275c36ae14093372534bfcb1f"
SRC_URI[sha256sum] = "3ad76c60c6d47c16241285e494b923375e995026da484a28cc416275461c5635"
S = "${WORKDIR}/${PN}-release-release-kinetic-hls_lfcd_lds_driver-0.1.4-0"

inherit catkin
