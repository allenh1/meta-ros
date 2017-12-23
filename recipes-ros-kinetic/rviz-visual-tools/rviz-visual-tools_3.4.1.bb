# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utility functions for displaying and debugging data in Rviz via published marker"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen-conversions eigen-stl-containers geometry-msgs graph-msgs libqt5x11extras5-dev roscpp roslint rviz sensor-msgs std-msgs tf-conversions trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/davetcoleman/rviz_visual_tools-release/archive/release/kinetic/rviz_visual_tools/3.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9045f765537daee6701027a1a5c57515"
SRC_URI[sha256sum] = "c68300087770ff5e54127d23c5896d415761e47af18aa6315be937799db2be6e"
S = "${WORKDIR}/rviz_visual_tools-release-release-kinetic-rviz_visual_tools-3.4.1-0"

inherit catkin
