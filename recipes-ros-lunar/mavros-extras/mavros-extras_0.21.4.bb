# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extra nodes and plugins for ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native cmake-modules geometry-msgs mavros mavros-msgs roscpp sensor-msgs std-msgs tf urdf visualization-msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros_extras/0.21.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7db179144150b3d2c034dbd76feed478"
SRC_URI[sha256sum] = "66ad6670404767e235d6a1586e1da5f4e0b91dc423224f0a28902c1540658598"
S = "${WORKDIR}/mavros-release-release-lunar-mavros_extras-0.21.4-0"

inherit catkin
