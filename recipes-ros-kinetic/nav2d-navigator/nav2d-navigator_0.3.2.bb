# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a node for higher level navigation of a mobile     robot i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "actionlib actionlib-msgs catkin-native geometry-msgs message-generation message-runtime nav2d-msgs nav2d-operator pluginlib roscpp std-srvs tf"
SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/kinetic/nav2d_navigator/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "457284e30fb0b8d1dc4bc24d8f573389"
SRC_URI[sha256sum] = "be431741eac23ffb2d7855b3ed48e2d269ad2d62345cfaa15ade8fd552ebd460"
S = "${WORKDIR}/navigation_2d-release-release-kinetic-nav2d_navigator-0.3.2-0"

inherit catkin
