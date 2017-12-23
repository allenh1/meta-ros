# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Autonomous mapping and navigation demos for the SawYer Roch"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "amcl base-local-planner catkin-native dwa-local-planner frontier-exploration gmapping map-server move-base navfn nodelet roch-bringup roch-safety-controller roscpp roslaunch sensor-msgs tf yocs-cmd-vel-mux"
SRC_URI = "https://github.com/SawYerRobotics-release/roch-release/archive/release/kinetic/roch_navigation/2.0.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c720d9590ff741e8bf0f6a9b6db9f77d"
SRC_URI[sha256sum] = "31c11c2052c6f4a79055c484f992ee293031477f46ee34f6cbfc41338a71f792"
S = "${WORKDIR}/roch-release-release-kinetic-roch_navigation-2.0.12-0"

inherit catkin
