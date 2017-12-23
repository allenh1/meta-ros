# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-ros-pkgs robot rqt-common-plugins rqt-robot-plugins stage-ros"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/kinetic/${PN}/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "689e97ba4606ccb9fc3feca9aa1fd63f"
SRC_URI[sha256sum] = "fa8dc1015016c13e06fdb42b253344d12867583010a9f3ef0d70afba65687924"
S = "${WORKDIR}/metapackages-release-release-kinetic-${PN}-1.3.1-0"

inherit catkin
