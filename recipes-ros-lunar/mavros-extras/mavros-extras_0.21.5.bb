# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extra nodes and plugins for ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin cmake-modules geometry-msgs mavros mavros-msgs roscpp sensor-msgs std-msgs tf urdf visualization-msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros_extras/0.21.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7ce603bff589a705440fca709b13e0c0"
SRC_URI[sha256sum] = "0865a580b9ae7206362276ff89181556fd872a6359690268429cdf34272647f0"
S = "${WORKDIR}/mavros-release-release-lunar-mavros_extras-0.21.5-0"

inherit catkin
