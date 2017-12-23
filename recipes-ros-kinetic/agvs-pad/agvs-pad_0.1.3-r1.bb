# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The agvs_pad package.Component to control the robot by using a ps3 pad."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ackermann-msgs catkin-native diagnostic-msgs diagnostic-updater geometry-msgs robotnik-msgs sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/RobotnikAutomation/agvs_common-release/archive/release/kinetic/agvs_pad/0.1.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "974d3ac2531ce9ebe467aa73c7efc9ac"
SRC_URI[sha256sum] = "4d5ed9a41e12e21d86ab4613dcdef0b72171d2f38b610e305c579589e8f6df3a"
S = "${WORKDIR}/agvs_common-release-release-kinetic-agvs_pad-0.1.3-1"

inherit catkin
