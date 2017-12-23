# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "diagnostic_updater contains tools for easily updating diagnostics. it is commonl"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs roscpp rostest std-msgs"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/kinetic/diagnostic_updater/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d53f78138169b2dadd7a6bcb5f3abc58"
SRC_URI[sha256sum] = "5e191305b5e50dfd3145567154d647d52ac2332fe95ce09149c90641996a0029"
S = "${WORKDIR}/diagnostics-release-release-kinetic-diagnostic_updater-1.9.2-0"

inherit catkin
