# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A controller ensuring the safe operation of your robot.      The SafetyControlle"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-threads geometry-msgs nodelet pluginlib roscpp sensor-msgs std-msgs yocs-controllers"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_safety_controller/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "66f5f51930235b4ae2a74135b50a86dc"
SRC_URI[sha256sum] = "d500af378978a73c9a0112fe1ea6329a04366731794ccabc8c9c1cc26e3008ec"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_safety_controller-0.8.2-0"

inherit catkin
