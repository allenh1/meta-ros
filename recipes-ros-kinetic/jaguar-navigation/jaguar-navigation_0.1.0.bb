# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Navigation package for DrRobot's Jaguar 4X4"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "amcl base-local-planner catkin-native dwa-local-planner frontier-exploration gmapping map-server move-base navfn roslaunch"
SRC_URI = "https://github.com/gstavrinos/jaguar-release/archive/release/kinetic/jaguar_navigation/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b3e6ad48564a52b41a1d0d395ee24757"
SRC_URI[sha256sum] = "4e3641e1523e34a555daca7e5c122f7e6a2978c7f997b3e8b4943dedc883329d"
S = "${WORKDIR}/jaguar-release-release-kinetic-jaguar_navigation-0.1.0-0"

inherit catkin
