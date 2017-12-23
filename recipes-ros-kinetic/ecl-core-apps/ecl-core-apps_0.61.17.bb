# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This includes a suite of programs demo'ing various aspects of the      ecl_core."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-command-line ecl-config ecl-containers ecl-converters ecl-devices ecl-errors ecl-exceptions ecl-formatters ecl-geometry ecl-ipc ecl-license ecl-linear-algebra ecl-sigslots ecl-streams ecl-threads ecl-time-lite ecl-type-traits"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_core_apps/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "75e23e914a246698f6a52d115bb3a047"
SRC_URI[sha256sum] = "e524feefba31851bbdc98e1388312597f102ccba343f4bf218cd2176adebb496"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_core_apps-0.61.17-0"

inherit catkin
