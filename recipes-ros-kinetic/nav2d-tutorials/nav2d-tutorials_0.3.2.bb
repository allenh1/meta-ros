# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains a set of tutorials that run 2D-Navigation within Stage-Simulator."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native nav2d-exploration nav2d-karto nav2d-localizer nav2d-msgs nav2d-navigator nav2d-operator nav2d-remote"
SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/kinetic/nav2d_tutorials/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c82040c3377ceae523acaf74e9be6a27"
SRC_URI[sha256sum] = "9c66ef5f00925e81fb4a68fd239460790ea767033ef2a4487ff102296dd0906b"
S = "${WORKDIR}/navigation_2d-release-release-kinetic-nav2d_tutorials-0.3.2-0"

inherit catkin
