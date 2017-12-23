# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extra navigation layers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3451ac68c96ad046452aa1310ca3a903"

DEPENDS = "catkin-native range-sensor-layer social-navigation-layers"
SRC_URI = "https://github.com/wu-robotics/navigation_layers_release/archive/release/kinetic/navigation_layers/0.3.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0449abfe31ba61a3b8b1ce19a06843dd"
SRC_URI[sha256sum] = "a341fdcc91749f5baaf232ad0bb971cf038186b036b113d4615b3a9ff97401be"
S = "${WORKDIR}/navigation_layers_release-release-kinetic-navigation_layers-0.3.1-1"

inherit catkin
