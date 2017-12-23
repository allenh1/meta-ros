# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides nonlinear state estimation through sensor fusion of an abritrary number"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules diagnostic-msgs diagnostic-updater eigen geographic-msgs geometry-msgs message-filters message-generation message-runtime nav-msgs python-catkin-pkg-native roscpp roslint sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros xmlrpcpp"
SRC_URI = "https://github.com/cra-ros-pkg/robot_localization-release/archive/release/kinetic/robot_localization/2.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "62f010c1f1b9f1c5d0caa5f17fec1fe6"
SRC_URI[sha256sum] = "f2a51eee7d3a81979b0ef25e870fbe3a26fbc9c3dae899c994501f9adabb7e9a"
S = "${WORKDIR}/robot_localization-release-release-kinetic-robot_localization-2.4.0-0"

inherit catkin
