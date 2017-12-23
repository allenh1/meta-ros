# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta-Package containing modules for 2D-Navigation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native nav2d-exploration nav2d-karto nav2d-localizer nav2d-msgs nav2d-navigator nav2d-operator nav2d-remote nav2d-tutorials"
SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/kinetic/${PN}/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "01903d2a3d93e72c1cb4dc3c24ecc441"
SRC_URI[sha256sum] = "a30719eb17149ddabe2be4d0588a1af00ddb005af2fcaaa0cac36c5c9e8c17c9"
S = "${WORKDIR}/navigation_2d-release-release-kinetic-${PN}-0.3.2-0"

inherit catkin
