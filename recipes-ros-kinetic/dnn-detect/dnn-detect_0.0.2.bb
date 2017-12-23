# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "DNN based detection"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure fiducial-msgs image-transport opencv3 roscpp sensor-msgs tf2 tf2-geometry-msgs tf2-ros visualization-msgs"
SRC_URI = "https://github.com/UbiquityRobotics-release/dnn_detect-release/archive/release/kinetic/dnn_detect/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0172d884076ef575ceafcc20e252ddaf"
SRC_URI[sha256sum] = "a56536acfb5d38acf17a8d9e0d3e87a29eafe58f36989bd70f51f47650fe3744"
S = "${WORKDIR}/dnn_detect-release-release-kinetic-dnn_detect-0.0.2-0"

inherit catkin
