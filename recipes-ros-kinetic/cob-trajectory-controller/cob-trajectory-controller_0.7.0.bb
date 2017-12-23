# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a trajectory controller which controlls velocities for a c"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib catkin-native cob-srvs control-msgs dynamic-reconfigure roscpp sensor-msgs std-msgs std-srvs trajectory-msgs"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_trajectory_controller/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4217ab5ac823f642965ac21df1107792"
SRC_URI[sha256sum] = "2905032976597a071355d53ff774c84c4e370ba5931021afa97507bb1286b3d5"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_trajectory_controller-0.7.0-0"

inherit catkin
