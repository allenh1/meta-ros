# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides launch files for operating Care-O-bot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "canopen-chain-node canopen-motor-node catkin-native cob-android-script-server cob-base-drive-chain cob-base-velocity-smoother cob-bms-driver cob-calibration-data cob-cam3d-throttle cob-collision-monitor cob-collision-velocity-filter cob-command-gui cob-control-mode-adapter cob-dashboard cob-default-env-config cob-default-robot-behavior cob-default-robot-config cob-docker-control cob-footprint-observer cob-frame-tracker cob-hand-bridge cob-hardware-config cob-helper-tools cob-image-flip cob-light cob-linear-nav cob-mimic cob-monitoring cob-moveit-config cob-obstacle-distance cob-omni-drive-controller cob-phidget-em-state cob-phidget-power-state cob-phidgets cob-reflector-referencing cob-relayboard cob-safety-controller cob-scan-unifier cob-script-server cob-sick-lms1xx cob-sick-s300 cob-sound cob-teleop cob-trajectory-controller cob-twist-controller cob-undercarriage-ctrl cob-voltage-control compressed-depth-image-transport compressed-image-transport controller-manager costmap-2d diagnostic-aggregator image-proc joint-state-controller joint-state-publisher joint-trajectory-controller joy laser-filters nodelet openni2-launch openni-launch position-controllers realsense-camera robot-state-publisher roslaunch rosserial-python rosserial-server rostopic rplidar-ros rviz schunk-powercube-chain sick-visionary-t-driver spacenav-node tf2-ros theora-image-transport topic-tools twist-mux ur-driver usb-cam velocity-controllers"
SRC_URI = "https://github.com/ipa320/cob_robots-release/archive/release/kinetic/cob_bringup/0.6.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2a1fe7a279de66768ea65ed3e48dfe85"
SRC_URI[sha256sum] = "da8bfc37a853d914933edefacfa22efe887965881f94711a26c2bce3a5a123ef"
S = "${WORKDIR}/cob_robots-release-release-kinetic-cob_bringup-0.6.7-1"

inherit catkin
