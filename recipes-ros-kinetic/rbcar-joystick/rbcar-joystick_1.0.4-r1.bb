# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rbcar_joystick package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ackermann-msgs catkin-native diagnostic-msgs diagnostic-updater geometry-msgs nav-msgs robotnik-msgs roscpp sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/RobotnikAutomation/rbcar_sim-release/archive/release/kinetic/rbcar_joystick/1.0.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "94d5c855aee66b8c1d56bf7c21be1e87"
SRC_URI[sha256sum] = "db5e41c29c92519214e12465cf9089f5bc7d34fb698daff0aa198ddbba8816c8"
S = "${WORKDIR}/rbcar_sim-release-release-kinetic-rbcar_joystick-1.0.4-1"

inherit catkin
