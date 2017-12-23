# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rbcar_robot_control package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ackermann-msgs catkin-native diagnostic-msgs diagnostic-updater geometry-msgs nav-msgs robotnik-msgs roscpp sensor-msgs tf"
SRC_URI = "https://github.com/RobotnikAutomation/rbcar_sim-release/archive/release/kinetic/rbcar_robot_control/1.0.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "93a92412a4623caf06819f09b6b7d0ac"
SRC_URI[sha256sum] = "cde4c04a409cb516dc98db02a20f54c8e72222aa28cdf82511125c4757f5cfaa"
S = "${WORKDIR}/rbcar_sim-release-release-kinetic-rbcar_robot_control-1.0.4-1"

inherit catkin
