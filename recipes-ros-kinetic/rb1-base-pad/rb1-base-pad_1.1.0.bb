# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rb1_base_pad package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater geometry-msgs message-generation message-runtime robotnik-msgs roscpp sensor-msgs"
SRC_URI = "https://github.com/RobotnikAutomation/rb1_base_common-release/archive/release/kinetic/rb1_base_pad/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "434687e666a3598c967eb8a18ed9ac45"
SRC_URI[sha256sum] = "e3b86d1d291cc24c956dd008025ebf3fd0320b121e5c22adc7bd6b2431f81dac"
S = "${WORKDIR}/rb1_base_common-release-release-kinetic-rb1_base_pad-1.1.0-0"

inherit catkin
