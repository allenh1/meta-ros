# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ackermann_controller package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "angles catkin-native control-msgs control-toolbox controller-interface forward-command-controller hardware-interface nav-msgs realtime-tools roscpp tf urdf"
SRC_URI = "https://github.com/easymov/ackermann_controller-release/archive/release/kinetic/ackermann_controller/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9cc008363ea67dbc57e55004bbbbaf14"
SRC_URI[sha256sum] = "40b0ec4a814e6dc4a893490338a19c4940d72b422d9ba07e362b0517b81021b0"
S = "${WORKDIR}/ackermann_controller-release-release-kinetic-ackermann_controller-0.1.2-0"

inherit catkin
