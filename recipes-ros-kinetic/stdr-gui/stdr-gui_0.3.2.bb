# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A gui in Qt for visualizing purposes in STDR Simulator."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native libqt4 libqt4-dev nav-msgs roscpp roslib sensor-msgs stdr-msgs stdr-parser stdr-robot stdr-server tf"
SRC_URI = "https://github.com/stdr-simulator-ros-pkg/stdr_simulator-release/archive/release/kinetic/stdr_gui/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9be6f505a512de15dd4433a79f50fc5c"
SRC_URI[sha256sum] = "444e19a08b4653cf8e4ec8568da5aa6bc4028b93fff48fc81f8544a60ac8a441"
S = "${WORKDIR}/stdr_simulator-release-release-kinetic-stdr_gui-0.3.2-0"

inherit catkin
