# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rbcar_description package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-runtime robotnik-sensors std-msgs std-srvs tf"
SRC_URI = "https://github.com/RobotnikAutomation/rbcar_common-release/archive/release/kinetic/rbcar_description/1.0.5-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cddc58d4556ff2b3986140df9152ae76"
SRC_URI[sha256sum] = "734d9b1f982d3bbfe7d0d05f7e1457dfd1c5ea9cc92d8bc7e10c6ef2aa79d549"
S = "${WORKDIR}/rbcar_common-release-release-kinetic-rbcar_description-1.0.5-1"

inherit catkin
