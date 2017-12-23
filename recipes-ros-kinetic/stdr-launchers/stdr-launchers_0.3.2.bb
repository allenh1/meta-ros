# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files, to easily bringup server, robots, guis"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native rviz stdr-gui stdr-resources stdr-robot stdr-server"
SRC_URI = "https://github.com/stdr-simulator-ros-pkg/stdr_simulator-release/archive/release/kinetic/stdr_launchers/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "329ac1fd5a0e0978241dc1e873c726ae"
SRC_URI[sha256sum] = "04d61a4dc59073b1ac1e61b41ec4f14c29e497748ea3a3d72ff5b316f918a8b2"
S = "${WORKDIR}/stdr_simulator-release-release-kinetic-stdr_launchers-0.3.2-0"

inherit catkin
