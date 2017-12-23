# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An RQT plugin for hierarchical launchfile configuration introspection."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roslaunch rospy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/pschillinger/rqt_launchtree-release/archive/release/kinetic/rqt_launchtree/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e53925d9c14941749e57377b5e6ad1d5"
SRC_URI[sha256sum] = "f9f0f62ac68638a58ca94642aeebc1ae4792d46754a31dc4a5d352ff24029305"
S = "${WORKDIR}/rqt_launchtree-release-release-kinetic-rqt_launchtree-0.2.0-0"

inherit catkin
