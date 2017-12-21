# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides nonlinear state estimation through sensor fusion of an abritrary number"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules diagnostic-msgs diagnostic-updater eigen eigen-conversions geographic-msgs geometry-msgs message-filters message-generation message-runtime nav-msgs nodelet python-catkin-pkg-native roscpp roslint sensor-msgs std-msgs std-srvs tf2 tf2-geometry-msgs tf2-ros xmlrpcpp yaml-cpp"
SRC_URI = "https://github.com/cra-ros-pkg/robot_localization-release/archive/release/lunar/robot_localization/2.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "634786d641971eeac98312f9feb932e1"
SRC_URI[sha256sum] = "864bd3c2b606d7db716e8c49084263904b98ad727f54c9e793561904f2659e1d"
S = "${WORKDIR}/robot_localization-release-release-lunar-robot_localization-2.5.0-0"

inherit catkin
