# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "diagnostics"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=d7863d10c1fa058fe10a5d8c058c5da3"

DEPENDS = "catkin diagnostic_aggregator diagnostic_analysis diagnostic_common_diagnostics diagnostic_updater self_test"
SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/lunar/diagnostics/1.9.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0220d788c6d6fffc63104e5398978149"
SRC_URI[sha256sum] = "78309343cd1097e67cff7412a9973c43f3f242e97f77e9b522d956f7dd8e33da"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
