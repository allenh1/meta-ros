# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides sample codes to demonstrate STDR simulator functionalities."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native geometry-msgs nav-msgs roscpp roslib sensor-msgs stdr-msgs tf"
SRC_URI = "https://github.com/stdr-simulator-ros-pkg/stdr_simulator-release/archive/release/kinetic/stdr_samples/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "51c672cf7da090a22f572febe1059da3"
SRC_URI[sha256sum] = "ad1d00afd61790ecd3711da0614f6b85957cc0b117786253eef21e860d833079"
S = "${WORKDIR}/stdr_simulator-release-release-kinetic-stdr_samples-0.3.2-0"

inherit catkin
