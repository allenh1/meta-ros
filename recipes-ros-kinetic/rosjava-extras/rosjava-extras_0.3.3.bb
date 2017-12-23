# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extra packages for rosjava_core"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native rosjava-bootstrap rosjava-build-tools rosjava-core sensor-msgs"
SRC_URI = "https://github.com/rosjava-release/rosjava_extras-release/archive/release/kinetic/rosjava_extras/0.3.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f37238d2eea8f735473a8b3762c276b4"
SRC_URI[sha256sum] = "0e1aa4b71d9adb7452a665f0b4cf84dddc3ab4c20e7997d25749cf212b3ae9a7"
S = "${WORKDIR}/rosjava_extras-release-release-kinetic-rosjava_extras-0.3.3-0"

inherit catkin
