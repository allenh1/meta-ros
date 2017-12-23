# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS nodelet and node that wraps the driver API for UEye cameras     by IDS Ima"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers camera-info-manager catkin-native dynamic-reconfigure image-transport nodelet roscpp sensor-msgs"
SRC_URI = "https://github.com/anqixu/ueye_cam-release/archive/release/kinetic/ueye_cam/1.0.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1bfff6bd49530b71d61b885c94882604"
SRC_URI[sha256sum] = "b58bc503b7feca34d7d68fe1af42d122635fbef9f5a6263d1d38269f09b18acc"
S = "${WORKDIR}/ueye_cam-release-release-kinetic-ueye_cam-1.0.16-0"

inherit catkin
