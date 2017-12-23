# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Robotnik standard sensors description. URDF and meshses."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hector-gazebo-plugins urdf xacro"
SRC_URI = "https://github.com/RobotnikAutomation/robotnik_sensors-release/archive/release/kinetic/robotnik_sensors/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ceca6bda142a26cab6fa1d7a99eb638"
SRC_URI[sha256sum] = "5791d69a13c63d40aecf9b40d25500a2323fddfbcf0e8bdd73548f0cb530a67e"
S = "${WORKDIR}/robotnik_sensors-release-release-kinetic-robotnik_sensors-1.1.1-0"

inherit catkin
