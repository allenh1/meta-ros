# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage for SawYer roch simulation software"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roch-gazebo"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_simulator-release/archive/release/kinetic/roch_simulator/2.0.12-5.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "906e5db848b1605bfa1830fb7c62b08c"
SRC_URI[sha256sum] = "fb827824bb5e30b1479ebe49c8fd7087f1cceaee93276cb5bf10bbb3d4f0adaa"
S = "${WORKDIR}/roch_simulator-release-release-kinetic-roch_simulator-2.0.12-5"

inherit catkin
